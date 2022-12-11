export default class Builder {
  private num: number
  private str: string
  private obj: object

  public setNum(num: number) {
    this.num = num
    return this
  }

  public setStr(str: string) {
    this.str = str
    return this
  }

  public setObj(obj: object) {
    this.obj = obj
    return this
  }

  public getNum(): number {
    return this.num
  }

  public getStr(): string {
    return this.str
  }

  public getObj(): object {
    return this.obj
  }

  build() {
    return
  }
}
