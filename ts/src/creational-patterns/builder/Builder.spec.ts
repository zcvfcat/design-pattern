import Builder from './Builder'
test('singleton 체크', () => {
  const num = 1
  const str = 'str'
  const obj = []
  const result = new Builder().setNum(num).setStr(str).setObj(obj).build()
  expect(result.getNum()).toBe(num)
  expect(result.getStr()).toBe(str)
  expect(result.getObj()).toBe(obj)
})
