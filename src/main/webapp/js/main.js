/**
 * Created by Дмитрий on 09.11.2016.
 */
/*//-----------addForm
$('#addDreamIcon').on('click', function () {
    $('#addDreamForm').show(500);
});
//-----------closeForm
$('#addDreamFormCloseIcon').on('click', function () {
    $('#addDreamForm').hide(500);
});
//-----------DeleteDream
$('.delete').on('click', function (event) {
    event.target.parentElement.parentElement.remove();
});
//-----------
$('#descriptionShow').on('click', function () {
   if($(this).hasClass('fa-caret-down')) {
       $('.aboutDream').slideDown(800);
       $('#descriptionShow').attr('class','fa fa-caret-up')
   } else {
       $('.aboutDream').slideUp(800);
       $('#descriptionShow').attr('class','fa fa-caret-down')
   }
});
//----------
$('#editShow').on('click', function () {
    if($(this).hasClass('closed')) {
        $('.descriptionEdit').slideDown(800);
        $(this).attr('class','opened fa fa-edit')
    } else {
        $('.descriptionEdit').slideUp(800);
        $(this).attr('class','closed fa fa-edit')
    }
});*/
//-----------addDream
/*
var dreamClone = $('.dream').clone();
$('#confirmDreamForm').on('click', function () {
    $('#addDreamForm').hide(500);
    var dreamName = $('.dreamName').val(),
        description = $('.description').val(),
        lsDream = localStorage.getItem('dream'),
        dreamId = Math.floor(Math.random() * 1000000);

    if (lsDream) {
        for (var i = 0; i < $('.dream').length; i++) {
            if (($(lsDream).attr('num')) == $($('dream')[i]).attr('num')) {
                dreamId = Math.floor(Math.random() * 1000000);
            } else {
                $('#userDreamList').append(dreamClone);
                dreamClone.attr('num', dreamId);
                var data = new Date();
                $($(dreamClone.children()[0]).text(data.getDay() + '.' + data.getMonth() + '.' + data.getFullYear()));
                $($(dreamClone.children().children('span')[0]).text(dreamName));
                dreamClone.show();
                localStorage.setItem('dream' + dreamId, dreamClone);
            }
        }
    } else {
        $('#userDreamList').append(dreamClone);
        dreamClone.attr('num', dreamId);
        var data = new Date();
        $($(dreamClone.children()[0]).text(data.getDay() + '.' + data.getMonth() + '.' + data.getFullYear()));
        $($(dreamClone.children().children('span')[0]).text(dreamName));
        dreamClone.show();
        localStorage.setItem('dream'+dreamId, dreamClone);
    }
});
*/


























