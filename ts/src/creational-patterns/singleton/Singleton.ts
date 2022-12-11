export default class Singleton {
  private constructor() {}
  private static instance = new Singleton()

  public static getInstance() {
    if (!Singleton.instance) Singleton.instance = new Singleton()
    return Singleton.instance
  }
}
