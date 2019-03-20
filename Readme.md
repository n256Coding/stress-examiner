Send a POST request to following URL with the data in body in format below. Make sure that request body should be in JSON format.
http://localhost:8080/stress/questions


Example Request

```
[
    {"question_id":"1", "answer":"yes"}, 
    {"question_id":"2", "answer":"no"}, 
    {"question_id":"3", "answer":"yes"}, 
    {"question_id":"4", "answer":"no"}, 
    {"question_id":"5", "answer":"no"}, 
    {"question_id":"6", "answer":"no"}, 
    {"question_id":"7", "answer":"yes"}, 
    {"question_id":"8", "answer":"no"}, 
    {"question_id":"9", "answer":"yes"}, 
    {"question_id":"10", "answer":"yes"}
]
```

Example CURL Command

```
curl -X POST -H 'Content-Type: application/json' -i http://localhost:8080/stress/questions --data '[
{"question_id":"1", "answer":"yes"}, 
{"question_id":"2", "answer":"no"}, 
{"question_id":"3", "answer":"yes"}, 
{"question_id":"4", "answer":"no"}, 
{"question_id":"5", "answer":"no"}, 
{"question_id":"6", "answer":"no"}, 
{"question_id":"7", "answer":"yes"}, 
{"question_id":"8", "answer":"no"}, 
{"question_id":"9", "answer":"yes"}, 
{"question_id":"10", "answer":"yes"}
]'
```