class GradedActivity:

    def __init__(self, grades):
        self.grades = grades


class PassFailActivity(GradedActivity):

    def __init__(self, score, grades):
        super().__init__(grades)
        self.score = int(score)

    def result(self):
        if self.score >= 40:
            return True
        else:
            return False


class PassFailExam(PassFailActivity):

    def __init__(self, passing_marks, score, grades):
        super().__init__(score, grades)
        self.passing_marks = passing_marks

    def grade_result(self):
        if super().result:
            print("pass")
        else:
            print("fail")


PassFailExam(40, 50, "A").grade_result()
