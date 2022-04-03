CREATE TABLE "movies" (
  "movie_id" INT PRIMARY KEY NOT NULL,
  "movie_title"VARCHAR NOT NULL,
  "movie_time" INT NOT NULL,
  "movie_ratings" VARCHAR NOT NULL,
  "movie_year" INT NOT NULL
);
git
INSERT INTO "movies" VALUES (1, 'Iron Man', 126, 'PG-13', 2008);
INSERT INTO "movies" VALUES (2, 'Captain America: The First Avenger', 124, 'PG-13', 2011);
INSERT INTO "movies" VALUES (3, 'Guardians of the Galaxy', 122, 'PG-13', 2014);
INSERT INTO "movies" VALUES (4, 'Wonder Woman 1984', 151, 'PG-13', 2020);
INSERT INTO "movies" VALUES (5, 'Batman v Superman: Dawn of Justice', 151, 'PG-13', 2016);
