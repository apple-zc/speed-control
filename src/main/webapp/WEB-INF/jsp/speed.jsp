<%@ page contentType="text/html; charset=gb2312"%>

<html lang="en">
<body style="background-image: none;">


<%--<form action="/speed/submit" method="post">--%>
    <%--speed:--%>
    <%--<textarea name="configOriginal">${configResult}</textarea>--%>
    <%--<input type="submit" value="Submit" />--%>
<%--</form>--%>

<%--<table>--%>


    <%--<c:forEach items="${map}" var="entry">--%>
        <%--<tr>--%>
            <%--<td><c:out value="${entry.key}" /></td>--%>
            <%--<td><c:out value="${entry.value}" /></td>--%>
        <%--</tr>--%>
    <%--</c:forEach>--%>
<%--</table>--%>


<form action="/speed/submit" method="post">
<textarea rows="15" cols="200" name="configOriginal">${configResult}</textarea>
    <br/>

    <input type="submit" value="读取控速规则" />
    <br/>
    <br/>

<table border="3">
    <tr>
        <th>行业</th>
        <th>接单速率</th>
        <th>下发仓速率</th>
    </tr>
    <tr>
        <td>其他</td>
        <td><input type="text" name="main_other_speed" value="${main_isYace_other_}" /></td>
        <td><input type="text" name="store_other_speed" value="${store_isYace_other_}" /></td>
    </tr>

    <tr>
        <td>商超5000000000002</td>
        <td><input type="text" name="main_5000000000002_speed" value="${main_isYace_5000000000002_}" /></td>
        <td><input type="text" name="store_5000000000002_speed" value="${store_isYace_5000000000002_}" /></td>
    </tr>

    <tr>
        <td>小电5000000000014</td>
        <td><input type="text" name="main_5000000000014_speed" value="${main_isYace_5000000000014_}" /></td>
        <td><input type="text" name="store_5000000000014_speed" value="${store_isYace_5000000000014_}" /></td>
    </tr>

    <tr>
        <td>大电5000000000001</td>
        <td><input type="text" name="main_5000000000001_speed" value="${main_isYace_5000000000001_}" /></td>
        <td><input type="text" name="store_5000000000001_speed" value="${store_isYace_5000000000001_}" /></td>
    </tr>

    <tr>
        <td>美妆5000000000013</td>
        <td><input type="text" name="main_5000000000013_speed" value="${main_isYace_5000000000013_}" /></td>
        <td><input type="text" name="store_5000000000013_speed" value="${store_isYace_5000000000013_}" /></td>
    </tr>

    <tr>
        <td>快消5000000000059</td>
        <td><input type="text" name="main_5000000000059_speed" value="${main_isYace_5000000000059_}" /></td>
        <td><input type="text" name="store_5000000000059_speed" value="${store_isYace_5000000000059_}" /></td>
    </tr>

    <tr>
        <td>保税5000000000009</td>
        <td><input type="text" name="main_5000000000009_speed" value="${main_isYace_5000000000009_}" /></td>
        <td><input type="text" name="store_5000000000009_speed" value="${store_isYace_5000000000009_}" /></td>
    </tr>

    <tr>
        <td></td>
        <td></td>
        <td></td>
    </tr>

    <tr>
        <td>总计</td>
        <td>${mainSpeedTotal}</td>
        <td>${storeSpeedTotal}</td>
    </tr>
</table>

    <br/>


<input type="submit" value="根据当前表格，修改控速规则" />
</form>

</body>
</html>