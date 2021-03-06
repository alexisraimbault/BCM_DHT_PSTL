package fr.sorbonne_u.components.dht.ports;

import fr.sorbonne_u.components.AbstractComponent;
import fr.sorbonne_u.components.ComponentI;
import fr.sorbonne_u.components.dht.components.Node;
import fr.sorbonne_u.components.dht.interfaces.NodeOfferedI;
import fr.sorbonne_u.components.ports.AbstractInboundPort;

public class NodeInboundPort extends AbstractInboundPort implements NodeOfferedI{
	private static final long serialVersionUID = 1L;

	public				NodeInboundPort(
		String uri,
		ComponentI owner
		) throws Exception
	{
		super(uri, NodeOfferedI.class, owner);
	}

	public				NodeInboundPort(ComponentI owner)
	throws Exception
	{
		super(NodeOfferedI.class, owner);
	}

	@Override
	public void setPred(String s, int n) throws Exception {
		synchronized(this) {
			this.getOwner().handleRequestAsync(
					new AbstractComponent.AbstractService<Void>() {
						@Override
						public Void call() throws Exception {
							((Node)this.getOwner()).
										setPred(s,n) ;
							return null;
						}
					}) ;
		}
		
	}

	@Override
	public void setSucc(String s, int n) throws Exception {
		synchronized(this) {
			this.getOwner().handleRequestAsync(
					new AbstractComponent.AbstractService<Void>() {
						@Override
						public Void call() throws Exception {
							((Node)this.getOwner()).
									setSucc(s,n) ;
							return null ;
						}
					}) ;
		}
		
	}

	@Override
	public void setIndex(int i) throws Exception {
		synchronized(this) {
			this.getOwner().handleRequestAsync(
					new AbstractComponent.AbstractService<Void>() {
						@Override
						public Void call() throws Exception {
							((Node)this.getOwner()).
									setIndex(i) ;
							return null;
						}
					}) ;
		}
	}
	
	/*@Override
	public void connect(String port) throws Exception {
		this.getOwner().handleRequestAsync(
				new AbstractComponent.AbstractService<Boolean>() {
					@Override
					public Boolean call() throws Exception {
						((Node)this.getOwner()).
								connect(port) ;
						return true;
					}
				}) ;
		
	}*/

	@Override
	public String getPred() throws Exception {
		synchronized(this) {
			return this.getOwner().handleRequestSync(
					new AbstractComponent.AbstractService<String>() {
						@Override
						public String call() throws Exception {
							return ((Node)this.getOwner()).
									getPred() ;
						}
					}) ;
		}
	}

	@Override
	public String getSucc() throws Exception {
		synchronized(this) {
			return this.getOwner().handleRequestSync(
					new AbstractComponent.AbstractService<String>() {
						@Override
						public String call() throws Exception {
							return ((Node)this.getOwner()).
									getSucc() ;
						}
					}) ;
		}
	}

	@Override
	public int getIndex() throws Exception {
		synchronized(this) {
			return this.getOwner().handleRequestSync(
					new AbstractComponent.AbstractService<Integer>() {
						@Override
						public Integer call() throws Exception {
							return ((Node)this.getOwner()).
									getIndex() ;
						}
					}) ;
		}
	}

	@Override
	public void stab1() throws Exception {
		synchronized(this) {
			this.getOwner().handleRequestAsync(
					new AbstractComponent.AbstractService<Void>() {
						@Override
						public Void call() throws Exception {
							((Node)this.getOwner()).stab1() ;
							return null;
						}
					}) ;
		}
	}

	@Override
	public void stab2(String startNode) throws Exception {
		synchronized(this) {
			this.getOwner().handleRequestAsync(
					new AbstractComponent.AbstractService<Void>() {
						@Override
						public Void call() throws Exception {
							((Node)this.getOwner()).stab2(startNode) ;
							return null;
						}
					}) ;
		}
	}

	@Override
	public void stab3(int succPredInd, int succInd, String predOfSucc) throws Exception {
		synchronized(this) {
			this.getOwner().handleRequestAsync(
					new AbstractComponent.AbstractService<Void>() {
						@Override
						public Void call() throws Exception {
							((Node)this.getOwner()).stab3(succPredInd, succInd, predOfSucc) ;
							return null;
						}
					}) ;
		}
	}

	@Override
	public void notifyPred1(int notifierIndex, String notifierIbpURI) throws Exception {
		synchronized(this) {
			this.getOwner().handleRequestAsync(
					new AbstractComponent.AbstractService<Void>() {
						@Override
						public Void call() throws Exception {
							((Node)this.getOwner()).notifyPred1(notifierIndex,notifierIbpURI) ;
							return null;
						}
					}) ;
		}
	}

	@Override
	public void notifyPred2(int notifierIndex, String notifierIbpURI, String notifiedIbpURI) throws Exception {
		synchronized(this) {
			this.getOwner().handleRequestAsync(
					new AbstractComponent.AbstractService<Void>() {
						@Override
						public Void call() throws Exception {
							((Node)this.getOwner()).notifyPred2(notifierIndex,notifierIbpURI, notifiedIbpURI) ;
							return null;
						}
					}) ;
		}
	}

	@Override
	public void notifyPred3(int notifierIndex, String notifierIbpURI, int predInd) throws Exception {
		synchronized(this) {
			this.getOwner().handleRequestAsync(
					new AbstractComponent.AbstractService<Void>() {
						@Override
						public Void call() throws Exception {
							((Node)this.getOwner()).notifyPred3(notifierIndex,notifierIbpURI, predInd) ;
							return null;
						}
					}) ;
		}
	}

	@Override
	public void store(String s) throws Exception {
		synchronized(this) {
			this.getOwner().handleRequestAsync(
					new AbstractComponent.AbstractService<Void>() {
						@Override
						public Void call() throws Exception {
							((Node)this.getOwner()).
										store(s) ;
							return null;
						}
					}) ;
		}
	}

	@Override
	public String retrieve(int id) throws Exception {
		synchronized(this) {
			return this.getOwner().handleRequestSync(
					new AbstractComponent.AbstractService<String>() {
						@Override
						public String call() throws Exception {
							return ((Node)this.getOwner()).
									retrieve(id) ;
						}
					}) ;
		}
	}
	
	@Override
	public void findSuccessor(String ClientIbpURI, int id) throws Exception {
		synchronized(this) {
			this.getOwner().handleRequestAsync(
					new AbstractComponent.AbstractService<Void>() {
						@Override
						public Void call() throws Exception {
							((Node)this.getOwner()).findSuccessor(ClientIbpURI, id) ;
							return null;
						}
					});
		}
	}
	
	@Override
	public int closestPrecedingNode(int id) throws Exception {
		synchronized(this) {
			return this.getOwner().handleRequestSync(
					new AbstractComponent.AbstractService<Integer>() {
						@Override
						public Integer call() throws Exception {
							return ((Node)this.getOwner()).closestPrecedingNode(id) ;
						}
					}) ;
		}
	}
	
	@Override
	public void fixFingers1() throws Exception {
		synchronized(this) {
			this.getOwner().handleRequestAsync(
					new AbstractComponent.AbstractService<Void>() {
						@Override
						public Void call() throws Exception {
							((Node)this.getOwner()).fixFingers1() ;
							return null;
						}
					}) ;
		}
	}
	
	@Override
	public void fixFingers2(String ibpURI) throws Exception {
		this.getOwner().handleRequestAsync(
				new AbstractComponent.AbstractService<Void>() {
					@Override
					public Void call() throws Exception {
						((Node)this.getOwner()).fixFingers2(ibpURI) ;
						return null;
					}
				}) ;
	}
	
	@Override
	public void fixFingers3(String ibpURI, int next) throws Exception {
		synchronized(this) {
			this.getOwner().handleRequestAsync(
					new AbstractComponent.AbstractService<Void>() {
						@Override
						public Void call() throws Exception {
							((Node)this.getOwner()).fixFingers3(ibpURI, next) ;
							return null;
						}
					}) ;
		}
	}
	

	@Override
	public void fixFingers4(String ibpURI, int id) throws Exception {
		this.getOwner().handleRequestAsync(
				new AbstractComponent.AbstractService<Void>() {
					@Override
					public Void call() throws Exception {
						((Node)this.getOwner()).fixFingers4(ibpURI, id) ;
						return null;
					}
				}) ;
	}

	@Override
	public void fixFingers5(String ibpURI, int indice) throws Exception {
		this.getOwner().handleRequestAsync(
				new AbstractComponent.AbstractService<Void>() {
					@Override
					public Void call() throws Exception {
						((Node)this.getOwner()).fixFingers5(ibpURI, indice) ;
						return null;
					}
				}) ;
	}
	
	@Override
	public void get(String clientIbpURI, String id) throws Exception {
		synchronized(this) {
			this.getOwner().handleRequestAsync(
					new AbstractComponent.AbstractService<Void>() {
						@Override
						public Void call() throws Exception {
							((Node)this.getOwner()).get(clientIbpURI, id) ;
							return null;
						}
					}) ;
		}
	}
	
	@Override
	public void put(String id, String value) throws Exception {
		synchronized(this) {
			this.getOwner().handleRequestAsync(
					new AbstractComponent.AbstractService<Void>() {
						@Override
						public Void call() throws Exception {
							((Node)this.getOwner()).put(id, value) ;
							return null;
						}
					}) ;
		}
	}

	@Override
	public void connectAndSendToClient(String ClientIbpURI, int id) throws Exception {
		synchronized(this) {
			this.getOwner().handleRequestAsync(
					new AbstractComponent.AbstractService<Void>() {
						@Override
						public Void call() throws Exception {
							((Node)this.getOwner()).
										connectAndSendToClient( ClientIbpURI,  id);
							return null;
						}
					}) ;
		}
	}

	@Override
	public void updateSuccessorList(String askingNodeIbpURI, int successorsToVisit) throws Exception {
		synchronized(this) {
			this.getOwner().handleRequestAsync(
					new AbstractComponent.AbstractService<Void>() {
						@Override
						public Void call() throws Exception {
							((Node)this.getOwner()).
							updateSuccessorList( askingNodeIbpURI,  successorsToVisit);
							return null;
						}
					}) ;
		}
	}

	@Override
	public void receiveUpdateSuccessorList(String succIbpURI, int succIndex) throws Exception {
		synchronized(this) {
			this.getOwner().handleRequestAsync(
					new AbstractComponent.AbstractService<Void>() {
						@Override
						public Void call() throws Exception {
							((Node)this.getOwner()).
							receiveUpdateSuccessorList( succIbpURI,  succIndex) ;
							return null;
						}
					}) ;
		}
	}

	@Override
	public void initiateUpdateSuccessorList() throws Exception {
		this.getOwner().handleRequestAsync(
				new AbstractComponent.AbstractService<Void>() {
					@Override
					public Void call() throws Exception {
						((Node)this.getOwner()).
						initiateUpdateSuccessorList();
						return null;
					}
				}) ;
		
	}

	@Override
	public void fixFing1() throws Exception {
		this.getOwner().handleRequestAsync(
				new AbstractComponent.AbstractService<Void>() {
					@Override
					public Void call() throws Exception {
						((Node)this.getOwner()).
						fixFing1();
						return null;
					}
				}) ;
	}

	@Override
	public void fixFing2(String senderIbp, int lastId, int id, int indice) throws Exception {
		this.getOwner().handleRequestAsync(
				new AbstractComponent.AbstractService<Void>() {
					@Override
					public Void call() throws Exception {
						((Node)this.getOwner()).
						fixFing2(senderIbp, lastId, id, indice);
						return null;
					}
				}) ;
	}

	@Override
	public void updateFing(int indice, int res, String resUri) throws Exception {
		this.getOwner().handleRequestAsync(
				new AbstractComponent.AbstractService<Void>() {
					@Override
					public Void call() throws Exception {
						((Node)this.getOwner()).
						updateFing(indice, res, resUri);
						return null;
					}
				}) ;
	}				
}
