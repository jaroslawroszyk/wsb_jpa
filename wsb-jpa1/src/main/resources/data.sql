INSERT INTO Address (city, address_Line1, address_Line2, postal_Code) VALUES
                                                                       ('Warszawa', 'ul. Nowa 1', 'lok. 12', '00-001'),
                                                                       ('Kraków', 'ul. Stara 5', NULL, '30-002'),
                                                                       ('Gdańsk', 'ul. Morska 10', 'Apt. 5', '80-003'),
                                                                       ('Wrocław', 'ul. Długa 15', NULL, '50-004'),
                                                                       ('Poznań', 'ul. Krótka 7', NULL, '60-005'),
                                                                       ('Łódź', 'ul. Centralna 3', 'lok. 8', '90-006'),
                                                                       ('Szczecin', 'ul. Nadodrzańska 2', NULL, '70-007'),
                                                                       ('Lublin', 'ul. Zielona 8', NULL, '20-008'),
                                                                       ('Katowice', 'ul. Główna 14', NULL, '40-009'),
                                                                       ('Bydgoszcz', 'ul. Spacerowa 6', 'lok. 3', '85-010');


INSERT INTO doctor (first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES
                                                                                                                   ('Jan', 'Kowalski', '123456789', 'jan.kowalski@example.com', 'D001', 'GP', 1),
                                                                                                                   ('Anna', 'Nowak', '234567890', 'anna.nowak@example.com', 'D002', 'OCULIST', 2),
                                                                                                                   ('Piotr', 'Wiśniewski', '345678901', 'piotr.wisniewski@example.com', 'D003', 'SURGEON', 3),
                                                                                                                   ('Maria', 'Dąbrowska', '456789012', 'maria.dabrowska@example.com', 'D004', 'DERMATOLOGIST', 4),
                                                                                                                   ('Tomasz', 'Lewandowski', '567890123', 'tomasz.lewandowski@example.com', 'D005', 'GP', 5),
                                                                                                                   ('Ewa', 'Zielińska', '678901234', 'ewa.zielinska@example.com', 'D006', 'OCULIST', 6),
                                                                                                                   ('Michał', 'Wójcik', '789012345', 'michal.wojcik@example.com', 'D007', 'SURGEON', 7),
                                                                                                                   ('Alicja', 'Kamińska', '890123456', 'alicja.kaminska@example.com', 'D008', 'DERMATOLOGIST', 8),
                                                                                                                   ('Paweł', 'Jankowski', '901234567', 'pawel.jankowski@example.com', 'D009', 'GP', 9),
                                                                                                                   ('Karolina', 'Mazur', '012345678', 'karolina.mazur@example.com', 'D010', 'OCULIST', 10);



INSERT INTO Patient (first_Name, last_Name, telephone_Number, email, patient_Number, date_Of_Birth, address_id) VALUES
                                                                                                              ('Adam', 'Kowalski', '111111111', 'adam.kowalski@example.com', 'P001', '1985-03-12', 1),
                                                                                                              ('Barbara', 'Nowak', '222222222', 'barbara.nowak@example.com', 'P002', '1990-07-25', 2),
                                                                                                              ('Cezary', 'Wiśniewski', '333333333', 'cezary.wisniewski@example.com', 'P003', '1978-11-05', 3),
                                                                                                              ('Dorota', 'Dąbrowska', '444444444', 'dorota.dabrowska@example.com', 'P004', '2000-01-18', 4),
                                                                                                              ('Eugeniusz', 'Lewandowski', '555555555', 'eugeniusz.lewandowski@example.com', 'P005', '1965-05-30', 5),
                                                                                                              ('Filip', 'Zieliński', '666666666', 'filip.zielinski@example.com', 'P006', '1988-09-22', 6),
                                                                                                              ('Gabriela', 'Wójcik', '777777777', 'gabriela.wojcik@example.com', 'P007', '1995-06-10', 7),
                                                                                                              ('Hanna', 'Kamińska', '888888888', 'hanna.kaminska@example.com', 'P008', '1983-12-15', 8),
                                                                                                              ('Igor', 'Jankowski', '999999999', 'igor.jankowski@example.com', 'P009', '1972-04-28', 9),
                                                                                                              ('Julia', 'Mazur', '000000000', 'julia.mazur@example.com', 'P010', '1999-02-07', 10);


INSERT INTO Visit (description, time, doctor_id, patient_id) VALUES
                                                                 ('Kontrola kardiologiczna', '2024-03-10 10:00:00', 1, 1),
                                                                 ('Badanie neurologiczne', '2024-03-11 11:30:00', 2, 2),
                                                                 ('Konsultacja ortopedyczna', '2024-03-12 09:15:00', 3, 3),
                                                                 ('Wizyta pediatryczna', '2024-03-13 14:00:00', 4, 4),
                                                                 ('Badanie dermatologiczne', '2024-03-14 16:45:00', 5, 5),
                                                                 ('Zabieg chirurgiczny', '2024-03-15 08:20:00', 6, 6),
                                                                 ('Konsultacja endokrynologiczna', '2024-03-16 12:10:00', 7, 7),
                                                                 ('Diagnoza onkologiczna', '2024-03-17 13:50:00', 8, 8),
                                                                 ('Terapia psychiatryczna', '2024-03-18 15:30:00', 9, 9),
                                                                 ('Badanie urologiczne', '2024-03-19 17:00:00', 10, 10);


INSERT INTO Medical_Treatment (description, type, visit_id) VALUES
                                                               ('EKG serca', 'EKG', 1),
                                                               ('Rezonans magnetyczny', 'RTG', 2),
                                                               ('USG stawu kolanowego', 'USG', 3),
                                                               ('Szczepienie przeciwko grypie', 'USG', 4),
                                                               ('Leczenie trądziku', 'USG', 5),
                                                               ('Usunięcie znamienia', 'USG', 6),
                                                               ('Badanie poziomu hormonów', 'USG', 7),
                                                               ('Biopsja guza', 'USG', 8),
                                                               ('Psychoterapia indywidualna', 'USG', 9),
                                                               ('Badanie prostaty', 'USG', 10);
