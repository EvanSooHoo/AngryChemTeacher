module.exports = {
  module: {
    rules: [
      {
        test: /\.txt$/i,
        use: 'raw-loader',
      },
    ],
  },
  presets: [
    '@vue/cli-plugin-babel/preset'
  ]
}
