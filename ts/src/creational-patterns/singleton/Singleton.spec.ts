import Singleton from './Singleton'

test('singleton 체크', () => {
  expect(Singleton.getInstance()).toBe(Singleton.getInstance())
})
