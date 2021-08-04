<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="es">

    <head>
        <title>Gestión Grand Hotel</title>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <!--     Fonts and icons     -->
        <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
        <!-- Material Kit CSS -->
        <link href="assets/css/material-dashboard.css" rel="stylesheet" />
    </head>

    <body>
        <div class="wrapper">
            <div class="sidebar" data-color="danger" data-background-color="white">
                <!--
          Tip 1: You can change the color of the sidebar using: data-color="purple | azure | green | orange | danger"
    
          Tip 2: you can also add an image using data-image tag
                -->

                <div class="logo">

                    <a href="index.jsp" class="simple-text logo-normal"><i class="material-icons">
                            hotel_class
                        </i>
                        Grand Hotel
                    </a>
                </div>
                <div class="sidebar-wrapper">
                    <ul class="nav">
                        <li class="nav-item">
                            <a class="nav-link" href="./principal.jsp">
                                <i class="material-icons">dashboard</i>
                                <p>Principal</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="./reservas.jsp">
                                <i class="material-icons">luggage</i>
                                <p>Reservas</p>
                            </a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="./personas.jsp">
                                <i class="material-icons">people</i>
                                <p>Personas</p>
                            </a>
                        </li>
                        <li class="nav-item ">
                            <a class="nav-link" href="./habitaciones.jsp">
                                <i class="material-icons">night_shelter</i>
                                <p>Habitaciones</p>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="main-panel">
                <!-- Navbar -->
                <nav class="navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top">
                    <div class="container-fluid">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-translate">
                            <a class="navbar-brand" href="./personas.jsp">Gestión de huéspedes y empleados</a>
                            <button class="navbar-toggler" type="button" data-toggle="collapse" aria-expanded="false" aria-label="Toggle navigation">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="navbar-toggler-icon"></span>
                                <span class="navbar-toggler-icon"></span>
                                <span class="navbar-toggler-icon"></span>
                            </button>
                        </div>
                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse">
                            <ul class="navbar-nav ml-auto">
                                <li class="dropdown nav-item">
                                    <a href="#" class="dropdown-toggle btn btn-warning btn-raised btn-round" data-toggle="dropdown">
                                        Huespedes
                                    </a>
                                    <div class="dropdown-menu">
                                        <a href="./crearHuesped.jsp" class="dropdown-item">
                                            Nuevo huesped
                                        </a>
                                        <form action="SvVerHuespedes" method="GET">
                                        <a href="SvVerHuespedes" class="dropdown-item SUBMIT">
                                            Consultar huéspedes
                                        </a></form>
                                    </div>
                                </li>
                                <li class="dropdown nav-item">
                                    <a href="#" class="dropdown-toggle btn btn-rose btn-raised btn-round" data-toggle="dropdown">
                                        Empleados
                                    </a>
                                    <div class="dropdown-menu">
                                        <a href="./crearEmpleado.jsp" class="dropdown-item">
                                            Nuevo empleado
                                        </a>
                                        <form action="SvVerEmpleados" method="GET">
                                        <a href="SvVerEmpleados" class="dropdown-item SUBMIT">
                                            Consultar empleados
                                        </a></form>
                                    </div>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="javascript:;" id="navbarDropdownProfile" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <i class="material-icons">face</i>
                                        <p class="d-lg-none d-md-block">
                                            Cuenta
                                        </p>
                                    </a>
                                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownProfile">
                                        <a class="dropdown-item" href="#">Perfil</a>
                                        <a class="dropdown-item" href="#">Configuraciones</a>
                                        <div class="dropdown-divider"></div>
                                        <a class="dropdown-item" href="#">Cerrar sesión</a>
                                    </div>
                                </li>
                            </ul>
                        </div>
                        <!-- /.navbar-collapse -->
                    </div>
                    <!-- /.container-->
                </nav>

                <!-- End Navbar -->
                <div class="content" style="background-image: url('./assets/img/luxury-hotel.jpg'); background-position:50%;">
                    <div class="container-fluid">

                        <div class="content">
                            <div class="container-fluid">
                                <div class="row">
                                    <div class="col-md-8">
                                        <div class="card">
                                            <div class="card-header card-header-warning">
                                                <h4 class="card-title">Crear Huésped</h4>
                                                <p class="card-category">Información personal</p>
                                            </div>
                                            <div class="card-body">
                                                <form action="SvCrearHuesped" method="POST">
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <div class="form-group">
                                                                <label class="label">Nombre</label>
                                                                <input type="text" class="form-control" name="txtNombre">
                                                            </div>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <div class="form-group">
                                                                <label class="label">Apellido</label>
                                                                <input type="text" class="form-control" name="txtApellido">
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <div class="form-group">
                                                                <label class="label">DNI</label>
                                                                <input type="text" class="form-control" name="txtDni">
                                                            </div>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <div class="form-group">
                                                                <label class="label">Fecha Nacimiento</label>
                                                                <input type="date" class="form-control" name="txtFechaNac">

                                                            </div>
                                                        </div>

                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <div class="form-group">
                                                                <label class="label">Dirección</label>
                                                                <input type="text" class="form-control" name="txtDireccion">
                                                            </div>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <div class="form-group">
                                                                <label class="label">Teléfono</label>
                                                                <input type="text" class="form-control" name="txtTelefono">
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <div class="form-group">
                                                                <label class="label">Correo electrónico</label>
                                                                <input type="email" class="form-control" name="txtEmail">
                                                            </div>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <div class="form-group">
                                                                <label class="label">Profesión</label>
                                                                <input type="text" class="form-control" name="txtProfesion">
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <button type="submit" class="btn btn-warning pull-right">Guardar</button>
                                                    <div class="clearfix"></div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>


                    </div>
                </div>
                <footer class="footer">
                    <div class="container-fluid">
                        <!-- <nav class="float-left">
                            <ul>
                                <li>
                                    <a href="https://www.creative-tim.com">
                              Creative Tim
                            </a>
                                </li>
                            </ul>
                        </nav> -->
                        <div class="copyright float-right">
                            &copy;
                            <script>
                                document.write(new Date().getFullYear())
                            </script>, made by Trinidad Boragini

                        </div>
                        <!-- your footer here -->
                    </div>
                </footer>
            </div>
        </div>
        <!--   Core JS Files   -->
        <script src="./assets/js/core/jquery.min.js"></script>
        <script src="./assets/js/core/popper.min.js"></script>
        <script src="./assets/js/core/bootstrap-material-design.min.js"></script>
        <script src="https://unpkg.com/default-passive-events"></script>
        <script src="./assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
        <!-- Place this tag in your head or just before your close body tag. -->
        <script async defer src="https://buttons.github.io/buttons.js"></script>
        <!--  Google Maps Plugin    -->
        <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
        <!-- Chartist JS -->
        <script src="./assets/js/plugins/chartist.min.js"></script>
        <!--  Notifications Plugin    -->
        <script src="./assets/js/plugins/bootstrap-notify.js"></script>
        <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->
        <script src="./assets/js/material-dashboard.js"></script>

        <script>
                                $(document).ready(function () {
                                    $().ready(function () {
                                        $sidebar = $('.sidebar');
                                        $sidebar_img_container = $sidebar.find('.sidebar-background');
                                        $full_page = $('.full-page');
                                        $sidebar_responsive = $('body > .navbar-collapse');
                                        window_width = $(window).width();
                                        $('.fixed-plugin a').click(function (event) {
                                            // Alex if we click on switch, stop propagation of the event, so the dropdown will not be hide, otherwise we set the  section active
                                            if ($(this).hasClass('switch-trigger')) {
                                                if (event.stopPropagation) {
                                                    event.stopPropagation();
                                                } else if (window.event) {
                                                    window.event.cancelBubble = true;
                                                }
                                            }
                                        });
                                        $('.fixed-plugin .active-color span').click(function () {
                                            $full_page_background = $('.full-page-background');
                                            $(this).siblings().removeClass('active');
                                            $(this).addClass('active');
                                            var new_color = $(this).data('color');
                                            if ($sidebar.length != 0) {
                                                $sidebar.attr('data-color', new_color);
                                            }

                                            if ($full_page.length != 0) {
                                                $full_page.attr('filter-color', new_color);
                                            }

                                            if ($sidebar_responsive.length != 0) {
                                                $sidebar_responsive.attr('data-color', new_color);
                                            }
                                        });
                                        $('.fixed-plugin .background-color .badge').click(function () {
                                            $(this).siblings().removeClass('active');
                                            $(this).addClass('active');
                                            var new_color = $(this).data('background-color');
                                            if ($sidebar.length != 0) {
                                                $sidebar.attr('data-background-color', new_color);
                                            }
                                        });
                                        $('.fixed-plugin .img-holder').click(function () {
                                            $full_page_background = $('.full-page-background');
                                            $(this).parent('li').siblings().removeClass('active');
                                            $(this).parent('li').addClass('active');
                                            var new_image = $(this).find("img").attr('src');
                                            if ($sidebar_img_container.length != 0 && $(
                                                    '.switch-sidebar-image input:checked').length != 0) {
                                                $sidebar_img_container.fadeOut('fast', function () {
                                                    $sidebar_img_container.css('background-image', 'url("' +
                                                            new_image + '")');
                                                    $sidebar_img_container.fadeIn('fast');
                                                });
                                            }

                                            if ($full_page_background.length != 0 && $(
                                                    '.switch-sidebar-image input:checked').length != 0) {
                                                var new_image_full_page = $('.fixed-plugin li.active .img-holder')
                                                        .find('img').data('src');
                                                $full_page_background.fadeOut('fast', function () {
                                                    $full_page_background.css('background-image', 'url("' +
                                                            new_image_full_page + '")');
                                                    $full_page_background.fadeIn('fast');
                                                });
                                            }

                                            if ($('.switch-sidebar-image input:checked').length == 0) {
                                                var new_image = $('.fixed-plugin li.active .img-holder').find("img")
                                                        .attr('src');
                                                var new_image_full_page = $('.fixed-plugin li.active .img-holder')
                                                        .find('img').data('src');
                                                $sidebar_img_container.css('background-image', 'url("' + new_image +
                                                        '")');
                                                $full_page_background.css('background-image', 'url("' +
                                                        new_image_full_page + '")');
                                            }

                                            if ($sidebar_responsive.length != 0) {
                                                $sidebar_responsive.css('background-image', 'url("' + new_image +
                                                        '")');
                                            }
                                        });
                                        $('.switch-sidebar-image input').change(function () {
                                            $full_page_background = $('.full-page-background');
                                            $input = $(this);
                                            if ($input.is(':checked')) {
                                                if ($sidebar_img_container.length != 0) {
                                                    $sidebar_img_container.fadeIn('fast');
                                                    $sidebar.attr('data-image', '#');
                                                }

                                                if ($full_page_background.length != 0) {
                                                    $full_page_background.fadeIn('fast');
                                                    $full_page.attr('data-image', '#');
                                                }

                                                background_image = true;
                                            } else {
                                                if ($sidebar_img_container.length != 0) {
                                                    $sidebar.removeAttr('data-image');
                                                    $sidebar_img_container.fadeOut('fast');
                                                }

                                                if ($full_page_background.length != 0) {
                                                    $full_page.removeAttr('data-image', '#');
                                                    $full_page_background.fadeOut('fast');
                                                }

                                                background_image = false;
                                            }
                                        });
                                        $('.switch-sidebar-mini input').change(function () {
                                            $body = $('body');
                                            $input = $(this);
                                            if (md.misc.sidebar_mini_active == true) {
                                                $('body').removeClass('sidebar-mini');
                                                md.misc.sidebar_mini_active = false;
                                                $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar();
                                            } else {

                                                $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar(
                                                        'destroy');
                                                setTimeout(function () {
                                                    $('body').addClass('sidebar-mini');
                                                    md.misc.sidebar_mini_active = true;
                                                }, 300);
                                            }

                                            // we simulate the window Resize so the charts will get updated in realtime.
                                            var simulateWindowResize = setInterval(function () {
                                                window.dispatchEvent(new Event('resize'));
                                            }, 180);
                                            // we stop the simulation of Window Resize after the animations are completed
                                            setTimeout(function () {
                                                clearInterval(simulateWindowResize);
                                            }, 1000);
                                        });
                                    });
                                });



        </script>
    </body>

</html>