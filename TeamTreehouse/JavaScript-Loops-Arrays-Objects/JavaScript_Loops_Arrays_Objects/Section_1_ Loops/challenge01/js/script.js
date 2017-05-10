var html = '';
var red;
var green;
var blue;
var rgbColor;
var counter = 0;

for(var counter = 0; counter < 10; counter++) {
    addCircle();
}

function addCircle() {
    red = getRandomColor();
    green = getRandomColor();
    blue = getRandomColor();
    rgbColor = 'rgb(' + red + ',' + green + ',' + blue + ')';
    html += '<div style="background-color:' + rgbColor + '"></div>';
}

function getRandomColor() {
    return Math.floor(Math.random() * 256 );
}



document.write(html);

