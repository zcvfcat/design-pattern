import Singleton from './Singleton'

const singleton1: Singleton = Singleton.getInstance()
const singleton2: Singleton = Singleton.getInstance()

console.log(singleton1 === singleton2)
