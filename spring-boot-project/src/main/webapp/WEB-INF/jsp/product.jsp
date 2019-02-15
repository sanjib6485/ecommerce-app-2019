<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <title>Create Product</title>

</head>
<body>
 <jsp:include page="shared/header.jsp"></jsp:include>


<div >

<h3>Product Details</h3>
<form  method='post'>
 
    <table class='table table-hover table-responsive table-bordered'>
 
        <tr>
            <td><b>id</b></td>
            <td><input type='text' name='id' class='form-control' value="${product.id}" /></td>
        </tr>
 
        <tr>
            <td><b>name</b></td>
            <td><input type='text' name='name' class='form-control' value="${product.name}" /></td>
        </tr>
 
        <tr>
            <td><b>price</b></td>
            <td><input type='text' name='price' class='form-control' size="10.2" value="${product.price}" /></td>
            
        </tr>
        
        <tr>
            <td><b>description</b></td>
            <td><input type='text' name='description' class='form-control' value="${product.description}" /></td>
        </tr>
        
        <tr>
            <td><b>categoryId</b></td>
            <td><input type='text' name='categoryId' class='form-control' value="${product.categoryId}" /></td>
        </tr>
 
        <tr>
            <td></td>
            <td>
                <button type="submit" class="btn btn-primary">Create Product</button>
            </td>
        </tr>
 
    </table>
</form>


</div>
	<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>

