# INSERT INTO user (username, password, nickname, activated) values ('admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', 'admin', 1);
# INSERT INTO user (username, password, nickname, activated) values ('user', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 1);
#
# INSERT INTO authority (authority_name) values ('ROLE_USER');
# INSERT INTO authority (authority_name) values ('ROLE_ADMIN');
#
# INSERT INTO user_authority (user_id, authority_name) values (1, 'ROLE_USER');
# INSERT INTO user_authority (user_id, authority_name) values (1, 'ROLE_ADMIN');
# INSERT INTO user_authority (user_id, authority_name) values (2, 'ROLE_USER');