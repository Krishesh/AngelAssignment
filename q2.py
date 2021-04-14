class Testbook:
    title = ""
    auther = ""
    publishfield = ""

    def __init__(self, arg=None):
        if arg is None:
            self.non_copy_constructor()
        else:
            self.copy_constructor(arg)

    def non_copy_constructor(self):
        pass

    # do the non-copy constructor stuff
    def copy_constructor(self, arg):
        pass
# do the copy constructor
