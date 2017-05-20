var PLAYERS = [
    {
        name: "Ronnie Johns",
        score: 32,
        id: 1
    },
    {
        name: "Ian Coleman",
        score: 12,
        id: 2
    },
    {
        name: "Joe Fields",
        score: 26,
        id: 3
    }
];
function Header(props) {
    return (
    <div className="header">
        <h1>{props.title}</h1>
    </div>
    );
}

Header.propTypes = {
    title: React.PropTypes.string.isRequired,
};

/* moving this back into a function to make it more unidirectional
var Counter = React.createClass({
    propTypes: {
        initialScore: React.PropTypes.number.isRequired,
    },

    getInitialState: function() {
        return {
            score: this.props.initialScore,
        }
    },

    incrementScore: function(e) {
        // always use this.setState instead of just saying this.state.score++ because that's what tells react to re-render itself.
        this.setState({
            score: this.state.score + 1
        });
    },

    decrementScore: function(e) {
        this.setState({
            score: this.state.score - 1
        });
    },

    // note that it's this.decrementScore, NOT this.decrementScore().  The latter passes the function
    //Which would result in it being called once everytime it's loaded.  The former passes the function OBJECT to the button
    render: function() {
        return (

        )
    },

});
*/

function Counter(props) {
    return (
        <div className="counter">
        <button className="counter-action decrement" > - </button>
        <div className="counter-score">{props.score}</div>
        <button className="counter-action increment" > + </button>
    </div>
    );
}

Counter.propTypes = {
    score: React.PropTypes.number.isRequired
}

function Player(props) {
    return (
        <div className="player">
            <div className="player-name">{props.name}</div>
            <div className="player-score">
                <Counter score={props.score}  />
            </div>
        </div>
    );
}

Player.propTypes = {
    name: React.PropTypes.string.isRequired,
    score: React.PropTypes.number.isRequired
}


var Application = React.createClass( {
    propTypes: {
        title: React.PropTypes.string,
        initialPlayers: React.PropTypes.arrayOf(React.PropTypes.shape({
            name: React.PropTypes.string.isRequired,
            score: React.PropTypes.number.isRequired,
            id: React.PropTypes.number.isRequired
        }
        )).isRequired,
    },

    getDefaultProps: function () {
        return {
            title: "Scoreboard"
        };
    },

    getInitialState: function () {
        return {
            players: this.props.initialPlayers
        };
    },

    render: function() {
        return (
            <div className="scoreboard">
                <Header title={this.props.title}/>

                <div className="players">
                    {this.state.players.map(function (player) {
                        return <Player name={player.name} score={player.score} key={player.id} />
                    })}
                </div>

            </div>
        );
    }
})
/* turning THIS into the stateful component (instead of Counter)
function Application(props) {

}

Application.propTypes = {
    title: React.PropTypes.string,
    players: React.PropTypes.arrayOf(React.PropTypes.shape({
        name: React.PropTypes.string.isRequired,
        score: React.PropTypes.number.isRequired,
        id: React.PropTypes.number.isRequired
        }
    )).isRequired,
};

Application.defaultProps = {
    title: "Scoreboard",
}
*/
ReactDOM.render(<Application initialPlayers={PLAYERS} />, document.getElementById('container'));