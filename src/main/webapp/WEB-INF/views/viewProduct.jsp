<%--
  Created by IntelliJ IDEA.
  User: petrus
  Date: 02.04.18
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<section id="services">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12 text-center">
                <h2 class="section-heading">View Product</h2>
                <p> Here is the details information of the product!</p>
                <hr class="my-4">
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-5">
                <img src="#" alt="image" style="width: 100%; height: 300px;"/>
            </div>
            <div class="col-md-5">
                <h3> Product name: ${product.productName}</h3>
                <p>Product description: ${product.productDescription}</p>
                <p> Manufacturer: ${product.productManufacturer}</p>
                <p>Category: ${product.productCategory}</p>
                <p>Price: ${product.productPrice}</p>
            </div>
        </div>
    </div>
</section>

<%@include file="/WEB-INF/views/template/footer.jsp"%>



