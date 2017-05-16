const list = document.getElementsByTagName('ul')[0];

list.addEventListener('click', function(e) {
    if (e.target.tagName == 'BUTTON') {
        let p = e.target.previousElementSibling;
        console.log(p.tagName);
        p.className = 'highlight';
    }
});