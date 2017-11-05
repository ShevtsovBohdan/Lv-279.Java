package zadachi.classutils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ClassUtil {

	/** Returns array of classes form package 'packageName'
	 * @return array of classes form package
	 * @param packageName - which package you want to scan
	 * */
	public static Class<?>[] getClasses(String packageName) {

		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

		if (classLoader == null) return null;

		String path = packageName.replace('.', '/');

		Enumeration<URL> resources = null;
		try {
			resources = classLoader.getResources(path);
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (resources == null) return null;

		List<File> dirs = new ArrayList<>();

		while (resources.hasMoreElements()) {
			URL resource = resources.nextElement();
			dirs.add(new File(resource.getFile()));
		}

		ArrayList<Class<?>> classes = new ArrayList<>();

		for (File directory : dirs) {
			classes.addAll(findClasses(directory, packageName));
		}

		return classes.toArray(new Class[classes.size()]);

	}

	private static List<Class<?>> findClasses(File directory, String packageName) {

		List<Class<?>> classes = new ArrayList<>();

		if (!directory.exists()) {
			return classes;
		}

		File[] files = directory.listFiles();

		if (files == null) return classes;

		for (File file : files) {

			if (file.isDirectory()) {
				assert !file.getName().contains(".");
				classes.addAll(findClasses(file, packageName + "." + file.getName()));
			} else if (file.getName().endsWith(".class")) {
				try {
					classes.add(
                            Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
		return classes;
	}

}