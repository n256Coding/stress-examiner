Send a POST request to following URL with the data in body in format below. Make sure that request body should be in JSON format.
http://localhost:8080/stress/questions


Example Request

```
[
    {"questionId":"1", "yesOrNo":"yes"}, 
    {"questionId":"2", "yesOrNo":"no"}, 
    {"questionId":"3", "yesOrNo":"yes"}, 
    {"questionId":"4", "yesOrNo":"no"}, 
    {"questionId":"5", "yesOrNo":"no"}, 
    {"questionId":"6", "yesOrNo":"no"}, 
    {"questionId":"7", "yesOrNo":"yes"}, 
    {"questionId":"8", "yesOrNo":"no"}, 
    {"questionId":"9", "yesOrNo":"yes"}, 
    {"questionId":"10", "yesOrNo":"yes"}
]
```

Example CURL Command

```
curl -X POST -H 'Content-Type: application/json' -i http://localhost:8080/stress/questions --data '[
{"questionId":"1", "yesOrNo":"yes"}, 
{"questionId":"2", "yesOrNo":"no"}, 
{"questionId":"3", "yesOrNo":"yes"}, 
{"questionId":"4", "yesOrNo":"no"}, 
{"questionId":"5", "yesOrNo":"no"}, 
{"questionId":"6", "yesOrNo":"no"}, 
{"questionId":"7", "yesOrNo":"yes"}, 
{"questionId":"8", "yesOrNo":"no"}, 
{"questionId":"9", "yesOrNo":"yes"}, 
{"questionId":"10", "yesOrNo":"yes"}
]'
```