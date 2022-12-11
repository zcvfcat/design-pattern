import path from 'path'
import { Configuration } from 'webpack'

const config: Configuration = {
  entry: path.resolve(__dirname, 'src'),
  output: {
    clean: true,
    path: path.resolve(__dirname, 'dist'),
  },
  resolve: { extensions: ['.js', '.jsx', '.ts', '.tsx'] },
  module: {
    rules: [
      {
        test: /\.(js|jsx|ts|tsx)$/,
        exclude: /node_modules/,
        use: {
          loader: 'babel-loader',
        },
      },
    ],
  },
}

export default config
