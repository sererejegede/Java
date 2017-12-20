<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>The Developer's Choice</title>

    <!-- Bootstrap core CSS -->
    <link href="grayscale/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="grayscale/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Cabin:700' rel='stylesheet' type='text/css'>

    <!-- Custom styles for this template -->
    <link href="grayscale/css/grayscale.min.css" rel="stylesheet">

  </head>

  <body id="page-top">

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
      <div class="container">
        <a class="navbar-brand js-scroll-trigger" href="#page-top">Start Bootstrap</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          Menu
          <i class="fa fa-bars"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="#about">About</a>
            </li>
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="#download">Download</a>
            </li>
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="#contact">Contact</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <!-- Intro Header -->
    <header class="masthead">
      <div class="intro-body">
        <!--<div class="container">-->
          <div class="row">
            <div class="col-lg-6 mx-auto">
              <h1 class="brand-heading">The <br>Developer's Choice</h1>
              <p class="intro-text">A simple application to record the
                <br>most preferred programming language of developers</p>
              <!--<a href="#about" class="btn btn-circle js-scroll-trigger">-->
                <!--<i class="fa fa-angle-double-down animated"></i>-->
              <!--</a>-->
            </div>
            <div class="col-lg-6">
              <div class="row">
                <div class="col-1"></div>
                <div class="col-6 card-body login-form">
                  <h5>Select Your Preference</h5>
                <table class="table table-hover table-striped">
                  <tr>
                    <th>First Option </th>
                    <td>
                      <select name="first">
                        <option>Java</option>
                        <option>FORTRAN</option>
                        <option>Python</option>
                        <option>C</option>
                        <option>C++</option>
                        <option>C#</option>
                        <option>PHP</option>
                        <option>JavaScript</option>
                        <option>Swift</option>
                        <option>Arduino</option>
                        <option>Ruby</option>
                        <option>MATLAB</option>
                        <option>HTML</option>
                        <option>Perl</option>
                        <option>SQL</option>
                      </select>
                    </td>
                  </tr>

                  <tr>
                    <th>Second Option </th>
                    <td>
                      <select name="second">
                        <option>Java</option>
                        <option>FORTRAN</option>
                        <option>Python</option>
                        <option>C</option>
                        <option>C++</option>
                        <option>C#</option>
                        <option>PHP</option>
                        <option>JavaScript</option>
                        <option>Swift</option>
                        <option>Arduino</option>
                        <option>Ruby</option>
                        <option>MATLAB</option>
                        <option>HTML</option>
                        <option>Perl</option>
                        <option>SQL</option>
                      </select>
                    </td>
                  </tr>

                  <tr>
                    <th>Third Option </th>
                    <td>
                      <select name="third">
                        <option>Java</option>
                        <option>FORTRAN</option>
                        <option>Python</option>
                        <option>C</option>
                        <option>C++</option>
                        <option>C#</option>
                        <option>PHP</option>
                        <option>JavaScript</option>
                        <option>Swift</option>
                        <option>Arduino</option>
                        <option>Ruby</option>
                        <option>MATLAB</option>
                        <option>HTML</option>
                        <option>Perl</option>
                        <option>SQL</option>
                      </select>
                    </td>
                  </tr>
                  <tr>
                    <td colspan="2"><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                      Submit
                    </button></td>
                  </tr>
                </table>
              </div>
              <div class="col-5"></div>
              </div>

              <!----------Modal**********-->


              <!-- The Modal -->
              <div class="modal fade" id="myModal">
                <div class="modal-dialog">
                  <div class="modal-content">

                    <!-- Modal Header -->
                    <div class="modal-header">
                      <h4 class="modal-title">Login</h4>
                      <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>

                    <!-- Modal body -->
                    <div class="modal-body">
                      <form action="Login" method="POST">
                        <input class="input-group" type="text" name="userName" placeholder="Enter Username" required="true" /><br>
                        <input class="input-group" type="password" name="password" placeholder="Enter Password" required="true" /><br>
                        <button class="btn btn-success" type="submit" value="Submit">Ok</button>  <button class="btn btn-warning" type="reset" value="Reset">Reset</button>
                      </form>
                    </div>

                    <!-- Modal footer -->
                    <div class="modal-footer">
                      <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    </div>

                  </div>
                </div>
              </div>
            </div>
          </div>
        <!--</div>-->
      </div>
    </header>



    <!-- Bootstrap core JavaScript -->
    <script src="grayscale/vendor/jquery/jquery.min.js"></script>
    <script src="grayscale/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="grayscale/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCRngKslUGJTlibkQ3FkfTxj3Xss1UlZDA&sensor=false"></script>

    <!-- Custom scripts for this template -->
    <script src="grayscale/js/grayscale.min.js"></script>

  </body>

</html>
