// Import router package
const router = require('express').Router();
const calculator = require('../services/calculator_service.js')


/* Hand get requests for '/calculator/'
/* this is the index or home page
*/
router.get('/', function (req, res) {

    // Send a JSON response - this app will be a web api so no need to send HTML
    //res.end(JSON.stringify({message: 'This is the home page'}));
    res.json({content: 'This is the default for calculator, try /calculator/add?a=2&b=3'});

});

// Get the sum of two numbers sent via the request Querystring and return the result
// endpoint is /calculator/add?a=1&b=1
router.get('/add', (req, res) => {

    // read values from req
    const a = req.query.a;
    const b = req.query.b;
    
    // If params are missing return 400
    if (typeof a === 'undefined' || typeof b === 'undefined') {
        res.statusMessage = "Bad Request - missing parameters"
        res.status(400).json({content: 'error'});
    }

    // Send back the result as an object in JSON form
    res.json(calculator.calculate(a, b, '+'));

});

// subtract two numbers sent via the request Querystring and return the result
// endpoint is /calculator/subtract?a=1&b=1
router.get('/subtract', (req, res) => {

    // read values from req
    const a = req.query.a;
    const b = req.query.b;
    
    // If params are missing return 400
    if (typeof a === 'undefined' || typeof b === 'undefined') {
        res.statusMessage = "Bad Request - missing parameters"
        res.status(400).json({content: 'error'});
    }

    // Send back the result as an object in JSON form
    res.json(calculator.calculate(a, b, '-'));

});

// multiply two numbers sent via the request Querystring and return the result
// endpoint is /calculator/multiply?a=1&b=1
router.get('/multiply', (req, res) => {

    // read values from req
    const a = req.query.a;
    const b = req.query.b;
    
    // If params are missing return 400
    if (typeof a === 'undefined' || typeof b === 'undefined') {
        res.statusMessage = "Bad Request - missing parameters"
        res.status(400).json({content: 'error'});
    }

    // Send back the result as an object in JSON form
    res.json(calculator.calculate(a, b, '*'));

});

// Divide two numbers sent via the request Querystring and return the result
// endpoint is /calculator/multiply?a=1&b=1
router.get('/divide', (req, res) => {

    // read values from req
    const a = req.query.a;
    const b = req.query.b;
    
    // If params are missing return 400
    if (typeof a === 'undefined' || typeof b === 'undefined') {
        res.statusMessage = "Bad Request - missing parameters"
        res.status(400).json({content: 'error'});
    }

    // Send back the result as an object in JSON form
    res.json(calculator.calculate(a, b, '/'));

});

// export
module.exports = router;

