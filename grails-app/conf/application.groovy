

// from documentation: http://grails-plugins.github.io/grails-spring-security-core/v3/index.html#configGroovyMap
grails.plugin.springsecurity.logout.postOnly = false
grails.plugin.springsecurity.rejectIfNoRule = true
//grails.plugin.springsecurity.fii.rejectPublicInvocations = true


// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'org.sample.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'org.sample.UserRole'
grails.plugin.springsecurity.authority.className = 'org.sample.Role'

grails.plugin.springsecurity.securityConfigType = "InterceptUrlMap" // default is "Annotation"

//grails.plugin.springsecurity.controllerAnnotations.staticRules = [
grails.plugin.springsecurity.interceptUrlMap = [
		[pattern: '/',               access: ['permitAll']],
		[pattern: '/error',          access: ['permitAll']],
		[pattern: '/index',          access: ['permitAll']],
		[pattern: '/index.gsp',      access: ['permitAll']],
		[pattern: '/shutdown',       access: ['permitAll']],
		[pattern: '/assets/**',      access: ['permitAll']],
		[pattern: '/**/js/**',       access: ['permitAll']],
		[pattern: '/**/css/**',      access: ['permitAll']],
		[pattern: '/**/images/**',   access: ['permitAll']],
		[pattern: '/**/favicon.ico', access: ['permitAll']],

		[pattern: '/login',          access: ['permitAll']],
		[pattern: '/login/**',		 access: ['permitAll']],
		[pattern: '/logout',         access: ['permitAll']],
		[pattern: '/logout/**',		 access: ['permitAll']],

		[pattern: '/race',      	 access: ['permitAll']],
		[pattern: '/race/**',      	 access: ['permitAll']],
		[pattern: '/runner',      	 access: ['ROLE_ADMIN']],
		[pattern: '/runner/**',      access: ['ROLE_ADMIN']],
		[pattern: '/registration',	 access: ['permitAll']],
		[pattern: '/registration/**',access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

