create table EMP_CERT 
	( employee_id INT NOT NULL, 
		certificate_id INT NOT NULL, 
		PRIMARY KEY (employee_id,certificate_id) );