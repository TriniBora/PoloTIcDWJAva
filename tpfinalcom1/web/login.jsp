<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="es">

<head>
    <title>Gestión Grand Hotel</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <!--     Fonts and icons     -->
    <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
    <!-- Material Kit CSS -->
    <link href="assets/css/material-kit.css?v=2.0.7" rel="stylesheet" />
</head>

<body>
    <nav class="navbar navbar-color-on-scroll navbar-transparent fixed-top navbar-expand-lg" color-on-scroll="100">
        <div class="container">
            <div class="navbar-translate">
                <a class="navbar-brand" href="index.html">
                    Home </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="navbar-toggler-icon"></span>
                    <span class="navbar-toggler-icon"></span>
                    <span class="navbar-toggler-icon"></span>
                </button>
            </div>
            <!-- <div class="collapse navbar-collapse">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a href="#" class="nav-link">
                            <i class="material-icons">apps</i> Template
                        </a>
                    </li>
                </ul>
            </div> -->
        </div>
    </nav>

    <div class="page-header header-filter" data-parallax="true" style="background-image: url('./assets/img/luxury-hotel.jpg')">
        <!-- <div class="page-header header-filter" style="background-image: url('../assets/img/bg7.jpg'); background-size: cover; background-position: top center;"> -->
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-6 ml-auto mr-auto">
                    <div class="card card-login">
                        <form class="form" action="SvUsuario" method="POST">
                            <div class="card-header card-header-danger text-center">
                                <h4 class="card-title">Iniciar sesión</h4>
                            </div>
                            <!-- <p class="description text-center">Or Be Classical</p> -->
                            <div class="card-body">
                                <div class="input-group">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">
                                            <i class="material-icons">face</i>
                                        </span>
                                    </div>
                                    <input type="text" class="form-control" name="txtUsername" placeholder="Nombre de usuario" required>
                                </div>
                                <div class="input-group">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">
                                            <i class="material-icons">lock_outline</i>
                                        </span>
                                    </div>
                                    <input type="password" class="form-control" name="txtPass" placeholder="Contraseña" required>
                                </div>
                            </div>
                            <div class="footer text-center">
                                <button class="btn btn-danger btn-link btn-wd btn-lg">Ingresar</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <footer class="footer footer-default">
        <div class="container">
            <!-- <nav class="float-left">
                <ul>
                    <li>
                        <a href="https://www.creative-tim.com/"></a>
                        Trinidad Boragini
                        </a>
                    </li>
                </ul>
            </nav> -->
            <div class="copyright float-right">
                &copy;
                <script>
                    document.write(new Date().getFullYear())
                </script>, by Trinidad Boragini
            </div>
        </div>
    </footer>
</body>

</html>