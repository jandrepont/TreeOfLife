create table creature (
  id  	      BIGSERIAL PRIMARY KEY,
  name       	VARCHAR(100),
  species     VARCHAR(100),
  age         NUMBER,
  sex         VARCHAR(20),
  weight      FLOAT,
  height      FLOAT,
  arms        NUMBER,
  legs        NUMBER,
  fingers     NUMBER,
  toes        NUMBER,
  description VARCHAR(200),
  common_name VARCHAR(35)
);