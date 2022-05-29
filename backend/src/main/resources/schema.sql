CREATE TABLE patient(
    patient_id  SERIAL NOT NULL,
    patient_name VARCHAR(128) NOT NULL,
    email VARCHAR(255) NOT NULL,
    pass VARCHAR(255) NOT NULL,
    PRIMARY KEY (patient_id)
);