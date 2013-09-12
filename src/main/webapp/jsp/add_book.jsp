<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>add a book</title>
</head>
<body>
<div>
    <h2>add a book</h2>
    <form:form method="post" action="addBook.page" commandName="book">
        <table>
            <tr>
                <td>
                    <form:label path="bookName">
                        book name
                    </form:label>
                </td>
                <td>
                    <form:input path="bookName" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="author">
                        author
                    </form:label>
                </td>
                <td>
                    <form:input path="author" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="price">
                        price
                    </form:label>
                </td>
                <td>
                    <form:input path="price" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="add book!" />
                </td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>