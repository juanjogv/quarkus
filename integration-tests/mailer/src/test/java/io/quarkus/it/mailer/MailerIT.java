package io.quarkus.it.mailer;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusIntegrationTest;

@QuarkusIntegrationTest
@QuarkusTestResource(MailpitTestResource.class)
public class MailerIT extends MailerTest {

}
