/* make your own custom components start with a capital letter */
function Application() {
  return (
      <div>
        <h1>Hello from react</h1>
        <p>I was rendered from the Application component</p>
      </div>
  );
}


//ReactDOM.render(<h1>Hello!</h1>, document.getElementById('container'));

ReactDOM.render(<Application />, document.getElementById('container'));