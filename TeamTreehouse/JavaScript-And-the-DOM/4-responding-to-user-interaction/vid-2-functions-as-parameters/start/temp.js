function say(something) {
    console.log(something);
}

//say("Hello");

function exec(func, arg) {
    func(arg);
}

exec(say, 'Hello');

exec(function makeNoise(noise) {
    console.log(noise);
    }, 'Hi There');
/*
exec((something) => {
    console.log(something);
    }, 'Anonymously say hello');


exec(() => {
    console.log('hi mom');
}, 'two');

 */