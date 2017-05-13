var dice = {
  sides: 6,
  roll: function () {
    var randomNumber = Math.floor(Math.random() * this.sides) + 1;
      return randomNumber;
  }
}

var dice10 = {
  sides: 10,
  roll: function () {
    var randomNumber = Math.floor(Math.random() * this.sides) + 1;
    console.log(randomNumber);
  }
}