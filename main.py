from cryptocomAPI.Request import Request

def main():
    request = Request()
    response = request.get_currencies()
    print(response)
    print(response.content)
    print(response.cookies)



if __name__ == '__main__':
    main()

