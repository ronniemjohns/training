var HtmlWebpackPlugin = require("html-webpack-plugin");

var webpackConfig = {
	entry: "./src/index.js",   // starting point of your application, can be an object for multiple entry points
	output: {                  // defines where app will be placed once build tasks are performed
		path: "build",
		filename: "bundle.js"
	},
	module: {                  //
		loaders: [             // defines how we want installed loaders to process our app
			{
				loader: "babel-loader",
				test: /\.js$/
			},
			{
				loaders: ["style", "css", "sass"],
				test: /\.scss$/
			}
		]
	},
	plugins: [
		new HtmlWebpackPlugin({
			template: "src/index.ejs"
		})
	]
};

module.exports = webpackConfig;
