import requests
import json

class Request:

    def __init__(self):
        with open('cryptocomAPI.json') as file:
            config = json.load(file)
            self.api_key = config['api_key']
            self.api_host = config['api_host']
        self.url = "https://" + self.api_host

    def setendpoint(self, endpoint):
        self.url = self.url + endpoint;

    def get_currencies(self):
        type = "GET"
        self.setendpoint("public/margin/get-transfer-currencies")
        return requests.request(type, self.url)
"""
    def get_currencies(self):
        type = "GET"
        querystring = {

        }
        headers = {

        }
        self.setendpoint("public/get-book")
        return requests.request(type, self.url, headers=headers, params=querystring)"""




