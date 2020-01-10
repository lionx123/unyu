javascript: (function() {
    document.querySelector('footer').style = 'display: none';
    var atop = document.getElementsByClassName('ad-top');
    if (atop.length > 0) {
        atop[0].parentNode.removeChild(atop[0]);
    }
})()
