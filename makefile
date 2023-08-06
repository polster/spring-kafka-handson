#!makefile

COMPOSE_FILE_INFRA = "./etc/docker-compose/local-dev-infra.yml"

docker-infra-up:
	COMPOSE_PROFILES=$(profiles) \
	docker compose -f ${COMPOSE_FILE_INFRA} up -d

docker-infra-down:
	COMPOSE_PROFILES=$(profiles) \
	docker compose -f ${COMPOSE_FILE_INFRA} down

docker-infra-status:
	docker ps -a \
		--filter "name=${COMPOSE_PROJECT_NAME}*" \
		--format "table {{.ID}}\t{{.Names}}\t{{.Status}}"

.PHONY: docker-infra-up \
	docker-infra-down \
	docker-infra-status