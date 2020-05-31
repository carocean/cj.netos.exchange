package cj.netos.exchange.cmd;

import cj.netos.exchange.IPriceBoard;
import cj.netos.exchange.bo.PriceBO;
import cj.netos.rabbitmq.CjConsumer;
import cj.netos.rabbitmq.RabbitMQException;
import cj.netos.rabbitmq.RetryCommandException;
import cj.netos.rabbitmq.consumer.IConsumerCommand;
import cj.studio.ecm.CJSystem;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.ultimate.gson2.com.google.gson.Gson;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Envelope;

import java.io.IOException;

@CjConsumer(name = "price_effector")
@CjService(name = "/notify/price.ports#update")
public class PriceUpdateCommand implements IConsumerCommand {
    @CjServiceRef
    IPriceBoard priceBoard;
    @Override
    public void command(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws RabbitMQException, RetryCommandException, IOException {
        PriceBO priceBO = new Gson().fromJson(new String(body), PriceBO.class);
        priceBoard.update(priceBO);
        CJSystem.logging().info(getClass(),String.format("bank=%s price=%s",priceBO.getBankid(),priceBO.getPrice()));
    }
}
