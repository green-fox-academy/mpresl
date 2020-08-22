use iceage;
SELECT title FROM Movie where director like 'Steven%';

SELECT DISTINCT Movie.year FROM Movie
INNER JOIN Rating ON Movie.mID = Rating.mID
WHERE Rating.stars > 3
ORDER BY Movie.year ASC;

SELECT Title from Movie LEFT JOIN Rating on Movie.mID = Rating.mID WHERE Rating.stars IS NULL;

SELECT name from Reviewer LEFT JOIN Rating on Reviewer.rID = Rating.rID WHERE Rating.ratingDate IS NULL;

SELECT name, title, stars, ratingDate from Rating JOIN Movie on Movie.mID = Rating.mID
JOIN Reviewer ON Reviewer.rID = Rating.rID
ORDER BY name, title, stars;

SELECT title, stars from Movie JOIN  Rating on Movie.mID = Rating.mID;
