<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Bootstrap Core CSS -->
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="/resources/css/bootstrap.css" rel="stylesheet">


    <title>Поездки (Информация получена от сервиса CarBlaCar)</title>

</head>
<body>

<div class="container">
    <div class="row" id="trips">
    <#list trips as trip>

        <div class="col-md-6">
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="row">
                        <div class="col-xs-12 col-sm-12">
                            <p><strong>Место отправления: </strong> ${trip.departure} </p>
                            <p><strong>Место назначения: </strong> ${trip.destination} </p>
                            <p><strong>Дата и время выезда: </strong> ${trip.date} </p>
                            <p><strong>Водитель: </strong> ${trip.driver.user.firstname} ${trip.driver.user.surname}
                            </p>
                            <p><strong>Автомобиль: </strong> ${trip.auto.brand} ${trip.auto.model}
                                - ${trip.auto.licensePlate} </p>
                        </div><!--/col-->

                    </div><!--/col-->

                </div><!--/row-->

            </div><!--/panel-body-->
        </div><!--/panel-->

    </#list>

    </div>
</body>
</html>