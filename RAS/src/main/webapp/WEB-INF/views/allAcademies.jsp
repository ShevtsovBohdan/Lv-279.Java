<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
            table-layout: fixed;
        }
        th{
            font-size: 10px;

        }
        th {background-color: powderblue;}
    </style>
</head>
<body>
<table>
    <tr>
        <th>Group name</th>
        <th>Name For Site</th>
        <th>Direction</th>
        <th>Profile</th>
        <th>Payment Status</th>
        <th>Location</th>
        <th>Strart Date</th>
        <th>End Date</th>
        <th>Status</th>
        <th>Experts</th>
        <th>Students Planned To Graduate</th>
        <th>Students Planned for Enrolment</th>
        <th>Students Actual</th>
        <th>Hired - Not Graduate</th>
        <th>Common Direction</th>
        <th>Payment Status</th>
        <th>Interviewer Feedback</th>
    </tr>
    <tr>
        <th><input type="text" name="groupName"></th>
        <th><input type="text" name="nameForSite"></th>
        <th>
            <select name="direction">

            </select>
        </th>
        <th>
            <select name="profile">

            </select>
        </th>
        <th>
            <select name="paymentStatus">

            </select>
        </th>
        <th>
            <select name="location">

            </select>
        </th>
        <th>
            <select name="strartDate">

            </select>
        </th>
        <th>
            <select name="endDate">

            </select>
        </th>
        <th>
            <select name="status">

            </select>
        </th>
        <th>
            <select name="experts">

            </select>
        </th>
        <th><input type="text" name="studentsPlannedToGraduate"></th>
        <th><input type="text" name="studentsPlannedForEnrolment"></th>
        <th><input type="text" name="studentsActual"></th>
        <th><input type="text" name="hiredNotGraduate"></th>
        <th>
            <select name="commonDirection">

            </select>
        </th>
        <th><input type="text" name="paymentStatus"></th>
        <th></th>
    </tr>
    <c:forEach items="${list}" var="list">
        <tr>
            <td>---</td>
            <td>${list.name}</td>
            <td>${list.technologies.name}</td>
            <td>---</td>
            <td>${list.free}</td>
            <td>---</td>
            <td>${list.start_date}</td>
            <td>${list.end_date}</td>
            <td>${list.academy_stages.name}</td>
            <td>---</td>
            <td>---</td>
            <td>---</td>
            <td>---</td>
            <td>---</td>
            <td>${list.directions.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>