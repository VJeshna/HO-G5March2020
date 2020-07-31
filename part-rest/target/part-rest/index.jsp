<html>
<body>
    <h2>Jersey RESTful Web Application!</h2>
    <p><a href="webapi/myresource">Jersey resource</a>
    <p>Visit <a href="http://jersey.java.net">Project Jersey website</a>
    for more information on Jersey!
    
    <p><a href="webapi/myresource/parts">List all parts</a>
    
    <p><a href="webapi/myresource/part/1001">List part1</a>
    <p><a href="webapi/myresource/part/1002">List part2</a>
    <p><a href="webapi/myresource/part/1003">List part3</a>
    
    
     <form action="webapi/myresource/part/save" method="POST">
    <table>
    <tr><td>Part id</td><td><input type="number" min="0" name="part_id"/></td></tr>
    <tr><td>Part Name</td><td><input type="text" name="part_name"/></td></tr>
    <!-- <tr><td>Unit Price</td><td><input type="text" name="unit_price"/></td></tr>
    <tr><td>Quantity</td><td><input type="number" min="0" name="quantity"/></td></tr> -->
    <tr><td colspan="2"><input type="submit" value="Save"/></td></tr>
    </table>   
    </form>
    
    <p><a href="webapi/myresource/part/delete/1004">delete part4</a>
    
    <p><a href="webapi/myresource/part/delete/1001/part-vanita">update part1</a>
    
    
</body>
</html>
