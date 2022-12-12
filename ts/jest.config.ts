import type { Config } from '@jest/types'

const config: Config.InitialOptions = {
  preset: 'ts-jest',
  testEnvironment: 'node',
  testMatch: ['**/*.spec.(ts|tsx)'],
  verbose: true,
  rootDir: 'ts',
}

export default config
