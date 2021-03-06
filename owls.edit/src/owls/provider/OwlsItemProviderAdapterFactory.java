/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import owls.util.OwlsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OwlsItemProviderAdapterFactory extends OwlsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.Owls} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsItemProvider owlsItemProvider;

	/**
	 * This creates an adapter for a {@link owls.Owls}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsAdapter() {
		if (owlsItemProvider == null) {
			owlsItemProvider = new OwlsItemProvider(this);
		}

		return owlsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsOntology} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsOntologyItemProvider owlsOntologyItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsOntology}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsOntologyAdapter() {
		if (owlsOntologyItemProvider == null) {
			owlsOntologyItemProvider = new OwlsOntologyItemProvider(this);
		}

		return owlsOntologyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsServiceItemProvider owlsServiceItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsServiceAdapter() {
		if (owlsServiceItemProvider == null) {
			owlsServiceItemProvider = new OwlsServiceItemProvider(this);
		}

		return owlsServiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsProfile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsProfileItemProvider owlsProfileItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsProfileAdapter() {
		if (owlsProfileItemProvider == null) {
			owlsProfileItemProvider = new OwlsProfileItemProvider(this);
		}

		return owlsProfileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsWsdlGrounding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsWsdlGroundingItemProvider owlsWsdlGroundingItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsWsdlGrounding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsWsdlGroundingAdapter() {
		if (owlsWsdlGroundingItemProvider == null) {
			owlsWsdlGroundingItemProvider = new OwlsWsdlGroundingItemProvider(this);
		}

		return owlsWsdlGroundingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsWsdlAtomicProcessGrounding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsWsdlAtomicProcessGroundingItemProvider owlsWsdlAtomicProcessGroundingItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsWsdlAtomicProcessGrounding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsWsdlAtomicProcessGroundingAdapter() {
		if (owlsWsdlAtomicProcessGroundingItemProvider == null) {
			owlsWsdlAtomicProcessGroundingItemProvider = new OwlsWsdlAtomicProcessGroundingItemProvider(this);
		}

		return owlsWsdlAtomicProcessGroundingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsProcess} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsProcessItemProvider owlsProcessItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsProcessAdapter() {
		if (owlsProcessItemProvider == null) {
			owlsProcessItemProvider = new OwlsProcessItemProvider(this);
		}

		return owlsProcessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsAtomicProcess} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsAtomicProcessItemProvider owlsAtomicProcessItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsAtomicProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsAtomicProcessAdapter() {
		if (owlsAtomicProcessItemProvider == null) {
			owlsAtomicProcessItemProvider = new OwlsAtomicProcessItemProvider(this);
		}

		return owlsAtomicProcessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsCompositeProcess} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsCompositeProcessItemProvider owlsCompositeProcessItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsCompositeProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsCompositeProcessAdapter() {
		if (owlsCompositeProcessItemProvider == null) {
			owlsCompositeProcessItemProvider = new OwlsCompositeProcessItemProvider(this);
		}

		return owlsCompositeProcessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsControlConstruct} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsControlConstructItemProvider owlsControlConstructItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsControlConstruct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsControlConstructAdapter() {
		if (owlsControlConstructItemProvider == null) {
			owlsControlConstructItemProvider = new OwlsControlConstructItemProvider(this);
		}

		return owlsControlConstructItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsSequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsSequenceItemProvider owlsSequenceItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsSequenceAdapter() {
		if (owlsSequenceItemProvider == null) {
			owlsSequenceItemProvider = new OwlsSequenceItemProvider(this);
		}

		return owlsSequenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsSplit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsSplitItemProvider owlsSplitItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsSplit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsSplitAdapter() {
		if (owlsSplitItemProvider == null) {
			owlsSplitItemProvider = new OwlsSplitItemProvider(this);
		}

		return owlsSplitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsAnyOrder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsAnyOrderItemProvider owlsAnyOrderItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsAnyOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsAnyOrderAdapter() {
		if (owlsAnyOrderItemProvider == null) {
			owlsAnyOrderItemProvider = new OwlsAnyOrderItemProvider(this);
		}

		return owlsAnyOrderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsPeform} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsPeformItemProvider owlsPeformItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsPeform}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsPeformAdapter() {
		if (owlsPeformItemProvider == null) {
			owlsPeformItemProvider = new OwlsPeformItemProvider(this);
		}

		return owlsPeformItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsParameterItemProvider owlsParameterItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsParameterAdapter() {
		if (owlsParameterItemProvider == null) {
			owlsParameterItemProvider = new OwlsParameterItemProvider(this);
		}

		return owlsParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsInput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsInputItemProvider owlsInputItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsInputAdapter() {
		if (owlsInputItemProvider == null) {
			owlsInputItemProvider = new OwlsInputItemProvider(this);
		}

		return owlsInputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsOutput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsOutputItemProvider owlsOutputItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsOutputAdapter() {
		if (owlsOutputItemProvider == null) {
			owlsOutputItemProvider = new OwlsOutputItemProvider(this);
		}

		return owlsOutputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsAssign} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsAssignItemProvider owlsAssignItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsAssign}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsAssignAdapter() {
		if (owlsAssignItemProvider == null) {
			owlsAssignItemProvider = new OwlsAssignItemProvider(this);
		}

		return owlsAssignItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsClientMessage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsClientMessageItemProvider owlsClientMessageItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsClientMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsClientMessageAdapter() {
		if (owlsClientMessageItemProvider == null) {
			owlsClientMessageItemProvider = new OwlsClientMessageItemProvider(this);
		}

		return owlsClientMessageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsInputClientMessage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsInputClientMessageItemProvider owlsInputClientMessageItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsInputClientMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsInputClientMessageAdapter() {
		if (owlsInputClientMessageItemProvider == null) {
			owlsInputClientMessageItemProvider = new OwlsInputClientMessageItemProvider(this);
		}

		return owlsInputClientMessageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsOutputClientMessage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsOutputClientMessageItemProvider owlsOutputClientMessageItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsOutputClientMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsOutputClientMessageAdapter() {
		if (owlsOutputClientMessageItemProvider == null) {
			owlsOutputClientMessageItemProvider = new OwlsOutputClientMessageItemProvider(this);
		}

		return owlsOutputClientMessageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsAssignClient} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsAssignClientItemProvider owlsAssignClientItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsAssignClient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsAssignClientAdapter() {
		if (owlsAssignClientItemProvider == null) {
			owlsAssignClientItemProvider = new OwlsAssignClientItemProvider(this);
		}

		return owlsAssignClientItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsAssignInputClient} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsAssignInputClientItemProvider owlsAssignInputClientItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsAssignInputClient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsAssignInputClientAdapter() {
		if (owlsAssignInputClientItemProvider == null) {
			owlsAssignInputClientItemProvider = new OwlsAssignInputClientItemProvider(this);
		}

		return owlsAssignInputClientItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link owls.OwlsAssignOutputClient} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsAssignOutputClientItemProvider owlsAssignOutputClientItemProvider;

	/**
	 * This creates an adapter for a {@link owls.OwlsAssignOutputClient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOwlsAssignOutputClientAdapter() {
		if (owlsAssignOutputClientItemProvider == null) {
			owlsAssignOutputClientItemProvider = new OwlsAssignOutputClientItemProvider(this);
		}

		return owlsAssignOutputClientItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (owlsItemProvider != null) owlsItemProvider.dispose();
		if (owlsOntologyItemProvider != null) owlsOntologyItemProvider.dispose();
		if (owlsServiceItemProvider != null) owlsServiceItemProvider.dispose();
		if (owlsProfileItemProvider != null) owlsProfileItemProvider.dispose();
		if (owlsWsdlGroundingItemProvider != null) owlsWsdlGroundingItemProvider.dispose();
		if (owlsWsdlAtomicProcessGroundingItemProvider != null) owlsWsdlAtomicProcessGroundingItemProvider.dispose();
		if (owlsProcessItemProvider != null) owlsProcessItemProvider.dispose();
		if (owlsAtomicProcessItemProvider != null) owlsAtomicProcessItemProvider.dispose();
		if (owlsCompositeProcessItemProvider != null) owlsCompositeProcessItemProvider.dispose();
		if (owlsControlConstructItemProvider != null) owlsControlConstructItemProvider.dispose();
		if (owlsSequenceItemProvider != null) owlsSequenceItemProvider.dispose();
		if (owlsSplitItemProvider != null) owlsSplitItemProvider.dispose();
		if (owlsAnyOrderItemProvider != null) owlsAnyOrderItemProvider.dispose();
		if (owlsPeformItemProvider != null) owlsPeformItemProvider.dispose();
		if (owlsParameterItemProvider != null) owlsParameterItemProvider.dispose();
		if (owlsInputItemProvider != null) owlsInputItemProvider.dispose();
		if (owlsOutputItemProvider != null) owlsOutputItemProvider.dispose();
		if (owlsAssignItemProvider != null) owlsAssignItemProvider.dispose();
		if (owlsClientMessageItemProvider != null) owlsClientMessageItemProvider.dispose();
		if (owlsInputClientMessageItemProvider != null) owlsInputClientMessageItemProvider.dispose();
		if (owlsOutputClientMessageItemProvider != null) owlsOutputClientMessageItemProvider.dispose();
		if (owlsAssignClientItemProvider != null) owlsAssignClientItemProvider.dispose();
		if (owlsAssignInputClientItemProvider != null) owlsAssignInputClientItemProvider.dispose();
		if (owlsAssignOutputClientItemProvider != null) owlsAssignOutputClientItemProvider.dispose();
	}

}
