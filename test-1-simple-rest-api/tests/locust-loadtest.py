from locust import HttpLocust, TaskSet, task

class WebsiteTasks(TaskSet):
    @task
    def index(self):
        self.client.get("/greeting?name=test")

class WebsiteUser(HttpLocust):
    task_set = WebsiteTasks
    min_wait = 10
    max_wait = 200