{
  mode: 'development',
  resolve: {
    modules: [
      'node_modules'
    ]
  },
  plugins: [
    TeamCityErrorPlugin {}
  ],
  module: {
    rules: [
      {
        test: /\.js$/,
        use: [
          'source-map-loader'
        ],
        enforce: 'pre'
      }
    ]
  },
  entry: {
    main: [
      'C:\\Users\\Atitienei Daniel\\IdeaProjects\\untitled\\build\\js\\packages\\untitled\\kotlin\\untitled.js'
    ]
  },
  output: {
    path: 'C:\\Users\\Atitienei Daniel\\IdeaProjects\\untitled\\build\\distributions',
    filename: [Function: filename],
    library: 'untitled',
    libraryTarget: 'umd',
    globalObject: 'this'
  },
  devtool: 'eval-source-map',
  stats: {
    warningsFilter: [
      /Failed to parse source map/
    ],
    warnings: false,
    errors: false
  },
  devServer: {
    open: true,
    contentBase: [
      'C:\\Users\\Atitienei Daniel\\IdeaProjects\\untitled\\build\\processedResources\\js\\main'
    ]
  }
}