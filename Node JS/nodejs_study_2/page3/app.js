const express = require('express');
const mysql = require('mysql');
const app = express();

app.use(express.static('public'));

const connection = mysql.createConnection({
  host: 'localhost',
  user: 'progate',
  password: 'password',
  database: 'list_app'
});

app.get('/', (req, res) => {
  res.render('top.ejs');
});

app.get('/index', (req, res) => {
  // Write the necessary code to get data from the database
  connection.query(
    'SELECT * FROM items',
    (error,results) => {
      console.log(results);
      res.render('index.ejs');
    }
    );
 
});

app.listen(3000);