
class Singleton():
    __instance__ = None

    @classmethod
    def getInstance(self):
        if self.__instance__ is None:
            self.__instance__ = self()

        return self


print(Singleton.getInstance() == Singleton.getInstance())
