//Example POST method invocation
var Client = require('node-rest-client').Client;
var fs = require('fs');


fs.readFile('orderOptions.json', 'utf8', function(err, contents) {

var client = new Client();
 
// set content-type header and data as json in args parameter
var args = {
    data: contents,
    headers: { "Content-Type": "application/json" }
};
 
client.post("http://localhost:2525/imposters", args, function (data, response) {
    // parsed response body as js object
//    console.log(data);
    // raw response
    console.log(response.statusCode);
});
});
