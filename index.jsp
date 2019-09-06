<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">

<head>
    <style type="text/css">
        .reset-box-sizing, .reset-box-sizing *, .reset-box-sizing *:before, .reset-box-sizing *:after,  .gsc-inline-block
        {
            -webkit-box-sizing: content-box;
            -moz-box-sizing: content-box;
            box-sizing: content-box;
        }
        input.gsc-input, .gsc-input-box, .gsc-input-box-hover, .gsc-input-box-focus, .gsc-search-button
        {
            box-sizing: content-box;
            line-height: normal;
        }
    </style>
    <meta charset="utf-8" />
    <link rel="shortcut icon" href="../../resources/img/favicon.ico" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>Certificates</title>
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />
    <link href="../../resources/css/jquery/jquery-ui.min.css" rel="stylesheet" />
    <!-- Bootstrap core CSS     -->
    <link rel="stylesheet" href="../../resources/css/bootstrap/bootstrap.min.css" />
    <!-- DataTables CSS -->
    <link href="../../resources/css/datatables/datatables.min.css" rel="stylesheet" />
    <!-- Sweet Alert 2 plugin -->
    <link rel="stylesheet" href="../../resources/css/sweetalert2/sweetalert2.min.css" />
    <!--  Material Dashboard CSS    -->
    <link href="../../resources/css/material/material-dashboard.css" rel="stylesheet" />
    <!-- Summernote CSS -->
    <link href="../../resources/css/summernote/summernote.css" rel="stylesheet" />
    <!--  selectize.JS CSS    -->
    <link href="../../resources/css/selectize/selectize.bootstrap3.css" rel="stylesheet" />
    <!-- Custom CSS for 360 components -->
    <link href="../../resources/css/custom/customComponents.css" rel="stylesheet" />
    <!--  Custom CSS for Class Roster App     -->
    <link rel="stylesheet" href="../../resources/css/custom/class-roster.css" />
    <!--     Fonts and icons     -->
    <link href="../../resources/css/fonts/font-awesome.min.css" rel="stylesheet" />
    <!--     Material Icons      -->
    <link rel="stylesheet" type="text/css" href="../../resources/iconfont/material-icons.css" />
</head>

<body>
    <div class="wrapper">
        <%@ include file="../../resources/layout/sidebar.jspf"%>
        <div class="main-panel">
            <%@ include file="../../resources/layout/top-nav.jspf"%>
            <div class="content">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-12">
                            <form class="navbar-form navbar-right">
                                <div class="input-group no-border">
                                    <input type="text" value="" class="form-control" placeholder="Search...">
                                    <button type="submit" class="btn btn-white btn-round btn-just-icon">
                                        <i class="material-icons">search</i>
                                        <div class="ripple-container"></div>
                                    </button>
                                </div>
                            </form>
                            <div class="card">
                                <div class="card-header card-header-icon" data-background-color="blue">
                                    <i class="material-icons">person</i>
                                </div>
                                <div class="card-content">
                                    <h4 class="card-title">Student's Information</h4>
                                    <div class="card-body ">
                                        <div class="row">
                                            <div class="col-md-12">
                                                <h3>Name : Fuzail Khan</h3>
                                                <p>
                                                    EMPLID : 12345678
                                                    <br />
                                                    Email : fuzail.khan@lc.cuny.edu
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="card card-nav-tabs">
                                <div class="card-header" data-background-color="blue">
                                    <div class="nav-tabs-navigation">
                                        <div class="nav-tabs-wrapper">
                                            <div><h5>Degrees :</h5></div>
                                            <ul class="nav nav-pills nav-pills-warning" role="tablist">
                                                <c:forEach items="${sInfo.getListDegree()}" var="degreeTab">
                                                    <li class="nav-item ${sInfo.getListDegree().indexOf(degreeTab) == 0 ? 'active' : ''}">
                                                        <a id="tab${sInfo.getListDegree().indexOf(degreeTab)}" href="#link${sInfo.getListDegree().indexOf(degreeTab)}"
                                                            data-toggle="tab">
                                                            Degree${sInfo.getListDegree().indexOf(degreeTab)}
                                                        </a>
                                                    </li>
                                                </c:forEach>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!---->
                                <div class="card-content">
                                    <div class="tab-content">
                                        <c:forEach items="${sInfo.getListDegree()}" var="degree">
                                            <div class="tab-pane material-datatables ${sInfo.getListDegree().indexOf(degree) == 0 ? 'active' : ''}" id="link${sInfo.getListDegree().indexOf(degree)}">
                                                <table class="scheduleTable table table-striped table-no-bordered table-hover" cellspacing="0" width="100%"style="width:100%">
                                                    <tbody>
                                                        <div class="card-body">
                                                            <div class="row">
                                                                <div class="col-md-12">
                                                                    <div class="col-md-4 col-sm-6 col-xs-12"><label>Degree : </label> ${degree.getDegreeType()}</div>
                                                                    <div class="col-md-4 col-sm-6 col-xs-12"><label>Date of the Degree : </label>${degree.getDateOfDegree()}</div>
                                                                    <div class="col-md-4 col-sm-6 col-xs-12"><label>GPA : </label> ${degree.getGpa()}</div>
                                                                    <div class="col-md-4 col-sm-6 col-xs-12"><label>Academic Plan : </label> ${degree.getPlan()}</div>
                                                                    <div class="col-md-4 col-sm-6 col-xs-12"><label>Academic Subplan : </label>${degree.getSubplan()}</div>
                                                                    <div class="col-md-4 col-sm-6 col-xs-12"><label>Number of Credits Completed : </label>${degree.getCredits()}</div>
                                                                    <div class="col-md-4 col-sm-6 col-xs-12"><label>Specialized Program : </label>${degree.getSpecialProg()}</div>
                                                                    <div class="col-md-4 col-sm-6 col-xs-12"><label>Student Teaching/Intern Course : </label>${degree.getInternCourse()}</div>
                                                                    <div class="col-md-4 col-sm-6 col-xs-12"><label>Semester : </label> ${degree.getSemester()}</div>
                                                                    <div class="col-md-4 col-sm-6 col-xs-12"><label>Grades : </label> ${degree.getGrades()}</div>
                                                                    <div class="col-md-4 col-sm-6 col-xs-12"><label>School : </label> ${degree.getSchool()}</div>
                                                                    <div class="col-md-4 col-sm-6 col-xs-12"><label>Final Grade : </label> ${degree.getFinalGrade()}</div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </tbody>
                                                </table>
                                            </div>
                                        </c:forEach>
                                    </div>
                                </div>
                            </div>
                            <div class="card">
                                <div class="card-header card-header-icon" data-background-color="blue">
                                    <i class="material-icons">description</i>
                                </div>
                                <div class="card-content">
                                    <h4 class="card-title">Certificates</h4>
                                    <div class="card-body">
                                        <div class="row">
                                            <div class="col-md-12">
                                                <div class="col-md-3">
                                                    <div class="dropdown bootstrap-select">
                                                        <select class="selectpicker" data-size="7" data-style="btn btn-primary btn-round"
                                                            title="Select a Certificate Type Below" tabindex="-98"data-background-color="" style="">
                                                            <c:forEach items="${certificateTypes}" var="value">
                                                                <c:if test="${value.getValue()==0}">
                                                                    <option disabled selected="">${value.getKey()}</option>
                                                                </c:if>
                                                                <c:if test="${value.getValue()!=0}">
                                                                    <option>${value.getKey()}</option>
                                                                </c:if>
                                                            </c:forEach>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6 col-lg-offset-3 component" id="HowDoI">
                                <div class="card">
                                    <div class="card-header card-header-icon" data-background-color="blue">
                                        <i class="material-icons">search</i>
                                    </div>
                                    <div class="card-content">
                                        <h4 class="card-title">How do I...</h4>
                                        <div class="row">
                                            <div class="col-md-12">
                                                <script>
                                                    function siteSearch() {
                                                        var cx = '014242850755786612983:ipits6j24n4';
                                                        var gcse = document.createElement('script');
                                                        gcse.type = 'text/javascript';
                                                        gcse.async = true;
                                                        gcse.src = 'https://cse.google.com/cse.js?cx=' + cx;
                                                        var s = document.getElementsByTagName('script')[0];
                                                        s.parentNode.insertBefore(gcse, s);
                                                    };
                                                    siteSearch(function() {
                                                        var branding = document.getElementsByClassName("gsc-branding-img");
                                                        var button   = document.getElementsByClassName("gsc-search-button");
                                                        console.log('callback after google');
                                                        branding.alt = 'Google';
                                                        button.alt   = 'search';
                                                    });
                                                </script>
                                                <gcse:search></gcse:search>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <%@ include file="../../resources/layout/footer.jspf"%>
        </div>
    </div>
    <!--   Core JS Files   -->
    <script type="text/javascript" src="../../resources/js/jquery/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="../../resources/js/jquery/jquery-ui.min.js"></script>
    <script type="text/javascript" src="../../resources/js/bootstrap/bootstrap.min.js"></script>
    <script type="text/javascript" src="../../resources/js/material/material.min.js"></script>
    <script type="text/javascript" src="../../resources/js/jquery/perfect-scrollbar.jquery.min.js"></script>
    <!-- Select Plugin -->
    <script type="text/javascript" src="../../resources/js/jquery/jquery.select-bootstrap.js"></script>
    <!-- Sweet Alert 2 plugin -->
    <script type="text/javascript" src="../../resources/js/sweetalert/sweetalert2.min.js"></script>
    <!-- Summernote plugin -->
    <script type="text/javascript" src="../../resources/js/summernote/summernote.min.js"></script>
    <!-- ComboBox Plugin -->
    <script type="text/javascript" src="../../resources/js/selectize/selectize.min.js"></script>
    <!-- Material Dashboard javascript methods -->
    <script type="text/javascript" src="../../resources/js/material/material-dashboard.js"></script>
    <!-- Material javascript  -->
    <script type="text/javascript" src="../../resources/js/material/material-1.3.0.min.js"></script>
    <!-- Data Tables -->
    <script src="../../resources/js/datatables/datatables.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.22.2/moment.min.js"></script>
    <script src="//cdn.datatables.net/plug-ins/1.10.19/sorting/datetime-moment.js"></script>
    <script type="text/javascript" src="../../resources/js/certificates/index.js"></script>
</body>
<%@ include file="/resources/layout/sessionTimeout.jspf"%>

</html>