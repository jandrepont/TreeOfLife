CREATE TABLE taxonomy (
  domain          varchar(20),
  kingdom         varchar(20),
  phylum          varchar(20),
  class           varchar(20),
  "order"         varchar(20),
  family          varchar(20),
  genus_species   varchar(20) PRIMARY KEY
);

-- TODO: add in data for species that are in creatures table
-- TODO: naming for columns need to be standardized to deal w/ domain_ and order_

INSERT INTO taxonomy ( domain, kingdom, phylum, class, "order", family, genus_species) VALUES
  ('Eukarya', 'animalia', 'chordata', 'mammalia', 'primates', 'hominidae', 'homo sapien' ),
  ('Eukarya', 'animalia', 'chordata', 'mammalia', 'carnivora', 'felidae', 'felis catus' );

