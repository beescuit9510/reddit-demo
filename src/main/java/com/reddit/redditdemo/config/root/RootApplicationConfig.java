package com.reddit.redditdemo.config.root;

import org.springframework.context.annotation.Import;

@Import(DatabaseConfig.class)
public class RootApplicationConfig {
}
